
public class Answer {
    private String animals;
    private String capital;
    private String putin;


    public Answer(String animals, String capital, String putin) {
        Statistic statistic = Statistic.getInstance();
        this.animals = animals;
        this.capital = capital;
        this.putin = putin;
        if(animals.equals("yes")){
            statistic.setCountAnimalsYes(statistic.getCountAnimalsYes() + 1);
        }else {
            statistic.setCountAnimalsNo(statistic.getCountAnimalsNo() + 1);
        }
        if (capital.equals("london")){
            statistic.setCountCapitalLondon(statistic.getCountCapitalLondon() + 1);
        }else {
            statistic.setCountCapitalBerlin(statistic.getCountCapitalBerlin() + 1);
        }
        if(putin.equals("Huylo")){
            statistic.setCountPutinHuylo(statistic.getCountPutinHuylo() + 1);
        }else {
            statistic.setCountPutinVeryHuylo(statistic.getCountPutinVeryHuylo() + 1);
        }
    }

    public void setPutin(String putin) {
        this.putin = putin;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setAnimals(String animals) {
        this.animals = animals;
    }

    public String getAnimals() {
        return animals;
    }

    public String getCapital() {
        return capital;
    }

    public String getPutin() {
        return putin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Answer answer = (Answer) o;

        if (animals != null ? !animals.equals(answer.animals) : answer.animals != null) return false;
        if (capital != null ? !capital.equals(answer.capital) : answer.capital != null) return false;
        if (putin != null ? !putin.equals(answer.putin) : answer.putin != null) return false;

        return true;
    }
    @Override
    public int hashCode() {
        int result = animals != null ? animals.hashCode() : 0;
        result = 31 * result + (capital != null ? capital.hashCode() : 0);
        result = 31 * result + (putin != null ? putin.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "Answer{" +
                "putin='" + putin + '\'' +
                ", capital='" + capital + '\'' +
                ", animals='" + animals + '\'' +
                '}';
    }
}
