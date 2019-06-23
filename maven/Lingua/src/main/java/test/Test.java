package test;

import com.github.pemistahl.lingua.api.Language;
import com.github.pemistahl.lingua.api.LanguageDetector;
import com.github.pemistahl.lingua.api.LanguageDetectorBuilder;

import java.util.List;

import static java.util.Arrays.asList;

public class Test {

    public static void main(String[] args) {
        final LanguageDetector detector = LanguageDetectorBuilder.fromAllBuiltInLanguages().build();
        final Language detectedLanguage = detector.detectLanguageOf("languages are awesome");
        final List<Language> languages = detector.detectLanguagesOf(asList("stroco", "kaco", "vafanqulo"));
        final Language detectedLanguage1 = detector.detectLanguageOf("вода");
//        System.out.println(detectedLanguage1);
        System.out.println(languages);
    }
}
