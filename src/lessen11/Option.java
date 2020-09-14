package lessen11;

public class Option {
    private String option;
    private boolean isTrueOption = false;

    public Option() {

    }
    public Option(String option, boolean isTrueOption) {
        this.option = option;
        this.isTrueOption = isTrueOption;
    }
    public void setOption(String option) {
        this.option = option;
    }
    public void setTrueOption(boolean isTrueOption) {
        this.isTrueOption = isTrueOption;

    }
    public String getOption() {
        return option;
    }
    public boolean isTrueOption() {
        return isTrueOption;
    }
}
