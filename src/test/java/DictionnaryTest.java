import org.junit.After;
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

    @Test
    public void testOneTranslation() {
        dictionnaire.addTranslation("contre", "against");
        dictionnaire.addTranslation("contre", "against");
        assertThat(dictionnaire.getTranslation("contre"), equalTo("against"));
        assertThat(dictionnaire.getTranslation("contre"), equalTo("against"));
    }

    @Test public void TestTranslationMultiple(){
        dictionnaire.setList("against");
        dictionnaire.setList("contre");
        dictionnaire.addTranslation("contre", dictionnaire.getList());
        assertThat(dictionnaire.getTranslation("contre"),equalTo(dictionnaire.getList()));
    }

    @After
    public void initConstruct1(){
        dictionnaire = new Dictionnary("example");
    }
}
