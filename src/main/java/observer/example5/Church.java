package observer.example5;

public interface Church {
    void registerParishioner(Parishioner parishioner);
    void removeParishioner(Parishioner parishioner);
    void notifyParishioners();
}
