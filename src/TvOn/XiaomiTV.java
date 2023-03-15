package TvOn;

//XiaomiTV 클래스 선언
public class XiaomiTV extends TV{

    //파워 on/off와 채널, 볼륨 선언 및 초기화
    private Boolean power;
    private String name;
    private int channel;
    private int volume;

    //XiaomiTV 기본 생성자
    public XiaomiTV () {
        this("Xiaomi",1,1);
    }
    //XiaomiTV 생성자(이름, 채널, 볼륨)
       public XiaomiTV (String name, int channel, int volume) {
        this.power = false;
        this.name = name;
        this.channel = channel;
        this.volume = volume;
    }

    //파워 on/off XiaomiTV가 켜질때 이름 표시를 위한 Override
    @Override
    public Boolean power() {
        power = !power;
        if (power) {
            //Xiaomi 브랜드와 전원이 켜지는속도를 출력하기 위한 Override
            System.out.println("전원이 켜집니다.(느리게)");
            System.out.println("Xiaomi");
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
    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        //채널이 바뀌는 속도를 위한 Override
        System.out.println("채널이 바꼈습니다.(느리게)");
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

