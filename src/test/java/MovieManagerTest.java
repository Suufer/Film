import org.example.MovieManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

    @Test
    public void testFindAll() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        assertArrayEquals(new String[] {"Movie 1", "Movie 2", "Movie 3"}, manager.findAll());
    }

    @Test
    public void testFindLastWithDefaultLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        assertArrayEquals(new String[] {"Movie 3", "Movie 2", "Movie 1"}, manager.findLast());
    }

    @Test
    public void testFindLastWithCustomLimit() {
        MovieManager manager = new MovieManager(2);
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        assertArrayEquals(new String[] {"Movie 3", "Movie 2"}, manager.findLast());
    }
}