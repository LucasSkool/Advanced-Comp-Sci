// No imports needed here

class MilkBar extends ChocolateBar {

    private static final double MILK_ADDIN_COST_PER_GRAM = 0.01;

    public MilkBar(int grams) {
        super(grams);
    }

    @Override
    public String getFlavorName() {
        return "Milk";
    }

    @Override
    public double getAddInCostPerGram() {
        return MILK_ADDIN_COST_PER_GRAM;
    }
}

class DarkBar extends ChocolateBar {

    private static final double DARK_ADDIN_COST_PER_GRAM = 0.02;

    public DarkBar(int grams) {
        super(grams);
    }

    @Override
    public String getFlavorName() {
        return "Dark";
    }

    @Override
    public double getAddInCostPerGram() {
        return DARK_ADDIN_COST_PER_GRAM;
    }
}

class MatchaBar extends ChocolateBar {

    private static final double MATCHA_ADDIN_COST_PER_GRAM = 0.03;

    public MatchaBar(int grams) {
        super(grams);
    }

    @Override
    public String getFlavorName() {
        return "Matcha";
    }

    @Override
    public double getAddInCostPerGram() {
        return MATCHA_ADDIN_COST_PER_GRAM;
    }
}