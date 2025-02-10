package observer.example5;

import java.util.ArrayList;
import java.util.List;

public class CatholicChurch implements Church {
     List<Parishioner> parishioners;
     String newsChurch;

    public CatholicChurch() {
        this.parishioners = new ArrayList<>();
    }

    @Override
    public void registerParishioner(Parishioner parishioner) {
        parishioners.add(parishioner);
    }

    @Override
    public void removeParishioner(Parishioner parishioner) {
        parishioners.remove(parishioner);
    }

    @Override
    public void notifyParishioners() {
        for (Parishioner parishioner: parishioners) {
            parishioner.update(newsChurch);
        }
    }

    public void setNewsChurch(String news) {
        this.newsChurch = news;
        notifyParishioners();
    }
}
