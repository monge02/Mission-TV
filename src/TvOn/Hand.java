package TvOn;

public class Hand {
    TV tv;

    private Boolean Button;
    private int channel;

    public Hand() {
        this.Button = false;
    }


    public Boolean handUseButton() {
        Button = !Button;
        System.out.println("전원 버튼을 눌렀습니다.");
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

    public void handUseChannelSet(int channel) {
        this.channel = channel;
        tv.setChannel(channel);
    }
    public int getHandUseChannel() {
        return channel;
    }

    public void setHandUseChannelUp() {
        channel++;
        tv.setChannel(channel);
    }
    public void setHandUseChannelDown() {
        channel--;
        if(channel<=0) {
            System.out.println("채널이 없습니다!");
            channel = 1;
        }
        tv.setChannel(channel);
    }
}
