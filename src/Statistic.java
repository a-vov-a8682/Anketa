public class Statistic {
    public static final Statistic instance = new Statistic();


    private int countAnimalsYes = 0;
    private int countAnimalsNo = 0;
    private int countCapitalLondon = 0;
    private int countCapitalBerlin = 0;
    private int countPutinHuylo = 0;
    private int countPutinVeryHuylo = 0;

    private Statistic(){

    }

    public int getCountAnimalsYes() {
        return countAnimalsYes;
    }
    public void setCountAnimalsYes(int countAnimalsYes) {
        this.countAnimalsYes = countAnimalsYes;
    }
    public int getCountAnimalsNo() {
        return countAnimalsNo;
    }
    public void setCountAnimalsNo(int countAnimalsNo) {
        this.countAnimalsNo = countAnimalsNo;
    }
    public int getCountCapitalLondon() {
        return countCapitalLondon;
    }
    public void setCountCapitalLondon(int countCapitalLondon) {
        this.countCapitalLondon = countCapitalLondon;
    }
    public int getCountCapitalBerlin() {
        return countCapitalBerlin;
    }
    public void setCountCapitalBerlin(int countCapitalBerlin) {
        this.countCapitalBerlin = countCapitalBerlin;
    }
    public int getCountPutinHuylo() {
        return countPutinHuylo;
    }
    public void setCountPutinHuylo(int countPutinHuylo) {
        this.countPutinHuylo = countPutinHuylo;
    }
    public int getCountPutinVeryHuylo() {
        return countPutinVeryHuylo;
    }
    public void setCountPutinVeryHuylo(int countPutinVeryHuylo) {
        this.countPutinVeryHuylo = countPutinVeryHuylo;
    }

    public static Statistic getInstance(){
        return instance;
    }

    public String getStatistic(){
        StringBuilder result = new StringBuilder();
        result.append("Like animals: " + getCountAnimalsYes() + "\n")
                .append("Do not like animals: " + getCountAnimalsNo() + "\n")
                .append("London is the capital: " + getCountCapitalLondon() + "\n")
                .append("Berlin is the capital: " + getCountCapitalBerlin() + "\n")
                .append("putin is Huylo: " + getCountPutinHuylo() + "\n")
                .append("putin is Very Huylo: " + getCountPutinVeryHuylo());

        return result.toString();
    }
}
