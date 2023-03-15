package TvOn;

//손 클래스를 상속받는 리모컨컨트롤 클래스
public class RemoteControl extends Hand{
    //TV지목
    TV tv;

    //버튼과 채널 선언 및 초기화
    private Boolean Button;
    private int channel;

    //RemoteControl 생성자
    public RemoteControl() {
        this.Button = false;
    }

    //손으로 리모컨버튼을 누르는 행동을 Override로 변경
    @Override
    public Boolean handUseButton() {
        Button = !Button;

        //Override로 변경한 출력
        System.out.println("리모콘 전원 버튼을 눌렀습니다.");
        if(Button) {
            System.out.println("TV에 신호 전달중...");
            tv.power();
        }
        if (!Button) {
            System.out.println("TV에 신호 전달중...");
            tv.power();
        }
        return Button;
    }

    //리모컨컨트롤로 채널 입력하는 행동 setter
    public void handUseChannelSet(int channel) {
        this.channel = channel;
        tv.setChannel(channel);
    }

    //채널 getter
    public int getHandUseChannel() {
        return channel;
    }

    //리모컨컨트롤로 채널 올리는 행동
    public void setHandUseChannelUp() {
        channel++;
        tv.setChannel(channel);
    }
    //리모컨컨트롤로 채널 내리는 행동
    public void setHandUseChannelDown() {
        channel--;
        if(channel<=0) {
            System.out.println("채널이 없습니다!");
            channel = 1;
        }
        tv.setChannel(channel);
    }
}
