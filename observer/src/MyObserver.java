import java.util.ArrayList;


public class MyObserver implements Source{
    private ArrayList<Channel> list = null;
    private String score = null;

    public MyObserver(){
        this.list = new ArrayList<>();
    }

    public void setScore(String score){
        this.score = score;
        notifyObs();
    }

    @Override
    public void register(Channel observer) {
        this.list.add(observer);
    }

    @Override
    public void notifyObs() {
        for (Channel obj: this.list) {
            obj.update(score);
        }
    }
}
