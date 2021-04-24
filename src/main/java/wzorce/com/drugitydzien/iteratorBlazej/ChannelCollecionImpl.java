package wzorce.com.drugitydzien.iteratorBlazej;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollecionImpl implements IChannelCollecion{

    private List<Channel> channels = new ArrayList<>();


    @Override
    public void addChannel(Channel channel) {
       channels.add(channel);

    }

    @Override
    public void removeChannel(Channel channel) {
        channels.remove(channel);
    }

    @Override
    public IChannelIterator iterator() {
        return new ChannelIterator(channels);
    }

    private class ChannelIterator implements IChannelIterator{

        private List<Channel> channelsList;
        private int position;

        public ChannelIterator(List<Channel> channelsList) {
            this.channelsList = channelsList;
        }

        @Override
        public boolean hasNext() {
            if(position< channelsList.size() && channelsList.get(position) != null){
                return true;
            }
            return false;
        }

        @Override
        public Channel next() {
            return channelsList.get(position++);
        }
    }

}
