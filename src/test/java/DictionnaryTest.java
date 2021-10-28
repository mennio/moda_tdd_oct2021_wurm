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
        dictionnaire = new Dictionnary();
    }

    @Test public void TestDictionaryName(){
        assertThat(dictionnaire.getNom(),equalTo("example"));
    }
}
