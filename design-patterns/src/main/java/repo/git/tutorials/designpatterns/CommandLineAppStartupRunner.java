package repo.git.tutorials.designpatterns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repo.git.tutorials.designpatterns.behavioral.strategy.SomeService;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    @Autowired
    private SomeService someService;

    @Override
    public void run(String...args) throws Exception {
        someService.doSomething();
    }
}
