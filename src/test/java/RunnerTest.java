import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@all or @t1",
        features = "src/test/features"
)
public class RunnerTest {
    public RunnerTest() {
    }
}
