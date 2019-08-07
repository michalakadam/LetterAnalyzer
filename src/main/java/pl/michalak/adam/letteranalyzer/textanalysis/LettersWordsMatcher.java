package pl.michalak.adam.letteranalyzer.textanalysis;

import java.util.*;

class LettersWordsMatcher {

    private final HashMap<String, List<String>> lettersWithWords;
    private final TextSplitter textSplitter;
    private final WordSplitter wordSplitter;

    private LettersWordsMatcher() {
        this.lettersWithWords = new HashMap<>();
        this.textSplitter = TextSplitter.newInstance();
        this.wordSplitter = WordSplitter.newInstance();
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
        Iterator iterator = this.lettersWithWords.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry)iterator.next();
            stringBuilder.append(pair.getKey()).append(": ").append(pair.getValue()).append("\n");
        }
        return stringBuilder.toString().replaceAll("[\\[\\]]", "");
    }

    static LettersWordsMatcher newInstance() {
        return new LettersWordsMatcher();
    }
}
