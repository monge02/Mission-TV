package TvOn;

public class SamsungTV extends TV {

    private Boolean power;
    private int channel;
    private int volume;

    public SamsungTV () {
        this("basic",1,1);
    }
    public SamsungTV (String name, int channel, int volume) {
        this.power = false;
        this.channel = channel;
        this.volume = volume;
    }
    @Override
    public Boolean power() {
        power = !power;
        if (power) {
            System.out.println("전원이 켜집니다.");
            System.out.println("두..둥 탁! Samsung");
            display();
        }
        if (!power) {
            System.out.println("전원이 꺼집니다.(아주빠르게)");
        } return power;
    }

    public void display() {
        System.out.println("채널 : " + getChannel() + ", 볼륨 : " + getVolume());
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("채널이 바꼈습니다.(빠르게)");
        display();
    }
    public int getChannel() {
        return channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;

    }
    public int getVolume() {
        return volume;
    }
}

