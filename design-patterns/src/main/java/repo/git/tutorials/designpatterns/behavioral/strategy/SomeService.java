package repo.git.tutorials.designpatterns.behavioral.strategy;

import org.springframework.stereotype.Service;

@Service
public class SomeService {

    private final StrategyFactory strategyFactory;

    public SomeService(StrategyFactory strategyFactory) {
        this.strategyFactory = strategyFactory;
    }

    public void doSomething(){
        Strategy strategy = strategyFactory.findStrategy(StrategyNameEnum.StrategyOne);
        strategy.doOperation();
        strategy = strategyFactory.findStrategy(StrategyNameEnum.StrategyTwo);
        strategy.doOperation();
    }
}
