import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {
    @Test
    public void FindCurrentFilmsTest() {
        AfishaManager afisha = new AfishaManager(10);
        afisha.addFilm("film8");
        afisha.addFilm("film10");

        String[] expected = {"film8", "film10"};
        String[] actual = afisha.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindCurrentFilms() {
        AfishaManager limit = new AfishaManager(10);
        limit.addFilm("film8");
        limit.addFilm("film10");

        String[] expected = {"film8", "film10"};
        String[] actual = limit.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testWhenLimitEquals() {
        AfishaManager afisha = new AfishaManager(10);
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");
        afisha.addFilm("film6");
        afisha.addFilm("film7");
        afisha.addFilm("film8");
        afisha.addFilm("film9");
        afisha.addFilm("film10");

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WhenLimitEquals() {
        AfishaManager limit = new AfishaManager(10);
        limit.addFilm("film1");
        limit.addFilm("film2");
        limit.addFilm("film3");
        limit.addFilm("film4");
        limit.addFilm("film5");
        limit.addFilm("film6");
        limit.addFilm("film7");
        limit.addFilm("film8");
        limit.addFilm("film9");
        limit.addFilm("film10");

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};
        String[] actual = limit.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWhenLimitLess() {
        AfishaManager afisha = new AfishaManager(10);
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");
        afisha.addFilm("film6");
        afisha.addFilm("film7");

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WhenLimitFilmsLess() {
        AfishaManager limit = new AfishaManager(10);
        limit.addFilm("film1");
        limit.addFilm("film2");
        limit.addFilm("film3");
        limit.addFilm("film4");
        limit.addFilm("film5");
        limit.addFilm("film6");
        limit.addFilm("film7");

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7"};
        String[] actual = limit.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastFilm() {
        AfishaManager afisha = new AfishaManager();
        afisha.addFilm("film10");

        String[] expected = {"film10"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastFilm2() {
        AfishaManager limit = new AfishaManager();
        limit.addFilm("film10");


        String[] expected = {"film10"};
        String[] actual = limit.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WhenItNotFindAnything() {
        AfishaManager limit = new AfishaManager(10);
        limit.addFilm("film17");
        limit.addFilm("film18");
        limit.addFilm("film19");

        String[] expected = {"film17", "film18", "film19"};
        String[] actual = limit.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WhenAnotherFilmsAreUnderLimit() {
        AfishaManager limit = new AfishaManager(10);
        limit.addFilm("film19");
        limit.addFilm("film20");
        limit.addFilm("film21");
        limit.addFilm("film22");
        limit.addFilm("film23");

        String[] expected = {"film19", "film20", "film21", "film22", "film23"};
        String[] actual = limit.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WhenFilmsMoreLimit() {
        AfishaManager limit = new AfishaManager(10);
        limit.addFilm("film1");
        limit.addFilm("film2");
        limit.addFilm("film3");
        limit.addFilm("film4");
        limit.addFilm("film5");
        limit.addFilm("film6");
        limit.addFilm("film7");
        limit.addFilm("film8");
        limit.addFilm("film9");
        limit.addFilm("film10");
        limit.addFilm("film11");
        limit.addFilm("film12");

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10", "film11", "film12"};
        String[] actual = limit.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WhenFilmsMoreLimit2() {
        AfishaManager afisha = new AfishaManager(10);
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");
        afisha.addFilm("film6");
        afisha.addFilm("film7");
        afisha.addFilm("film8");
        afisha.addFilm("film9");
        afisha.addFilm("film10");
        afisha.addFilm("film11");
        afisha.addFilm("film12");

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10", "film11", "film12"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
