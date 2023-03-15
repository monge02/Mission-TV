package TvOn;

public class TV {

    private Boolean power;
    private int channel;
    private int volume;

    public TV () {
        this("basic",1,1);
    }
    public TV (String name, int channel, int volume) {
        this.power = false;
        this.channel = channel;
        this.volume = volume;
    }

    public Boolean power() {
        power = !power;
        if (power) {
            System.out.println("전원이 켜집니다.");
            display();
        }
        if (!power) {
            System.out.println("전원이 꺼집니다.");
        } return power;
    }

    public void display() {
        System.out.println("채널 : " + getChannel() + ", 볼륨 : " + getVolume());
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("채널이 바꼈습니다.");
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
