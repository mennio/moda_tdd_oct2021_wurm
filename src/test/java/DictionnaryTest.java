import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DictionnaryTest {

    private Dictionnary dictionnaire;

    @Test
    public void testInutile(){
        assertFalse(false);
    }

    @Before
    public void initConstruct(){
        dictionnaire = new Dictionnary("example");
    }

    @Test
    public void TestDictionaryName(){
        assertThat(dictionnaire.getNom(),equalTo("example"));
    }

    @Test
    public void dictionnaireVide(){
        assertThat(dictionnaire.isEmpty(),equalTo(true));
    }

    @Test public void testOneTranslation() {
        dictionnaire.addTranslation("contre", "against");
        assertThat(dictionnaire.getTranslation("contre"), equalTo("against"));
    }
}
