package TvOn;

//SamsungTV 클래스 선언
public class SamsungTV extends TV {

    //파워 on/off와 이름, 채널, 볼륨 선언 및 초기화
    private Boolean power;
    private String name;
    private int channel;
    private int volume;

    //SamsungTV 기본 생성자
    public SamsungTV () {
        this("SamsungTV",1,1);
    }
    //SamsungTV 생성자(이름, 채널, 볼륨)
    public SamsungTV (String name, int channel, int volume) {
        this.power = false;
        this.channel = channel;
        this.volume = volume;
    }
    //파워 on/off SamsungTV가 켜질때 이름 표시를 위한 Override
    @Override
    public Boolean power() {
        power = !power;
        if (power) {
            //Samsung 브랜드와 전원이 켜지는속도, 효과음을 출력하기 위한 Override
            System.out.println("전원이 켜집니다.(아주빠르게)");
            System.out.println("두..둥 탁! Samsung");
            display();
        }
        if (!power) {
            System.out.println("전원이 꺼집니다.");
        } return power;
    }

    public void display() {
        System.out.println("채널 : " + getChannel() + ", 볼륨 : " + getVolume());
    }

    //채널이 바뀌는 행동 setter
    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        //채널이 바뀌는 속도를 위한 Override
        System.out.println("채널이 바꼈습니다.(빠르게)");
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

