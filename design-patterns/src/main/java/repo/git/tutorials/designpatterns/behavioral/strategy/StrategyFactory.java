package repo.git.tutorials.designpatterns.behavioral.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class StrategyFactory {

    private Map<StrategyNameEnum, Strategy> strategies;

    @Autowired
    public StrategyFactory(Set<Strategy> strategySet){
        createStrategy(strategySet);
    }

    private void createStrategy(Set<Strategy> strategySet){
        strategies = new HashMap<>();
        strategySet.forEach(strategy -> strategies.put(strategy.getStrategy(), strategy));
    }

    public Strategy findStrategy(StrategyNameEnum strategyName){
        return strategies.get(strategyName);
    }
}
