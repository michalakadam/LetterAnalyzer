package pl.michalak.adam.letteranalyzer.textanalysis;

import java.util.*;

class LettersWordsMatcher {

    private final HashMap<String, List<String>> lettersWithWords;
    private final TextSplitter textSplitter;
    private final WordSplitter wordSplitter;

    private LettersWordsMatcher(HashMap lettersWithWords, TextSplitter textSplitter, WordSplitter wordSplitter) {
        this.lettersWithWords = lettersWithWords;
        this.textSplitter = textSplitter;
        this.wordSplitter = wordSplitter;
    }

    String matchWordsToLetters(final String text) {
        String textInLowerCase = text.toLowerCase();
        HashSet<String> words = this.textSplitter.split(textInLowerCase);
        fillLettersWithWords(words);
        return lettersWithWordsToString();
    }

    private void putKeyAndValue(String character, String word, List<String> wordsForCharacterKey) {
        wordsForCharacterKey.add(word);
        this.lettersWithWords.put(character, wordsForCharacterKey);
    }

    private void fillLettersWithWords(HashSet<String> words) {
        for(String word : words) {
            for(String character : this.wordSplitter.split(word)) {
                List<String> wordsForCharacterKey = this.lettersWithWords.get(character);
                if(wordsForCharacterKey != null) {
                    putKeyAndValue(character, word, wordsForCharacterKey);
                    // TODO: 07.08.2019 add Polish as well as big letters
                } else if (character.matches("[a-z]")){
                    wordsForCharacterKey = new ArrayList<>();
                    putKeyAndValue(character, word, wordsForCharacterKey);
                }
            }
        }
    }

    private String lettersWithWordsToString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> stringListEntry : this.lettersWithWords.entrySet()) {
            stringBuilder
                    .append(((Map.Entry) stringListEntry).getKey())
                    .append(": ")
                    .append(((Map.Entry) stringListEntry).getValue())
                    .append("\n");
        }
        return stringBuilder.toString().replaceAll("[\\[\\]]", "");
    }

    static LettersWordsMatcher newInstance() {
        return new LettersWordsMatcher(new HashMap<>(), TextSplitter.newInstance(), WordSplitter.newInstance());
    }
}
