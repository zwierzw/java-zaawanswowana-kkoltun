package wzorce.com.drugitydzien.iteratorBlazej;

public class IteratorDemo {
    public static void main(String[] args) {

        IChannelCollecion channelCollecion = new ChannelCollecionImpl();
        channelCollecion.addChannel(new Channel("sport"));
        channelCollecion.addChannel(new Channel("muzykatv"));
        channelCollecion.addChannel(new Channel("przyrodatv"));


        IChannelIterator iterator = channelCollecion.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
