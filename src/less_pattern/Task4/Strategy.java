package less_pattern.Task4;

class Strategy {
    private ILogger strategy;
    
    public Strategy(ILogger logger){
        this.strategy = logger;
    }

    public void write() {
    	strategy.write();
    }
}