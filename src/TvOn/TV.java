package TvOn;

//TV 클래스 선언
public class TV {

    //파워 on/off와 이름, 채널, 볼륨 선언 및 초기화
    private Boolean power;
    private String name;
    private int channel;
    private int volume;

    //TV 기본 생성자
    public TV () {
        this("basic",1,1);
    }
    //TV 생성자(이름, 채널, 볼륨)
    public TV (String name, int channel, int volume) {
        this.power = false;
        this.name = name;
        this.channel = channel;
        this.volume = volume;
    }

    //파워 on/off
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

    //TV의 상태를 표시해주는 출력
    public void display() {
        System.out.println("채널 : " + getChannel() + ", 볼륨 : " + getVolume());
    }

    //채널이 바뀌는 행동 setter
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("채널이 바꼈습니다.");
        display();
    }
    //채널 바뀌는 행동 getter
    public int getChannel() {
        return channel;
    }

    //볼륨 바뀌는 행동 setter
    public void setVolume(int volume) {
        this.volume = volume;
    }
    //볼륨 바뀌는 행동 getter
    public int getVolume() {
        return volume;
    }
}
