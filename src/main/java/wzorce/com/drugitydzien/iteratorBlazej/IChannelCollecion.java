package wzorce.com.drugitydzien.iteratorBlazej;

public interface IChannelCollecion {

    void addChannel(Channel channel);
    void removeChannel(Channel channel);

    IChannelIterator iterator();
}
