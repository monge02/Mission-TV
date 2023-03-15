package TvOn;

public class Main {
       public static void main(String[] args) {

        //Hand,TV,RemoteControl 선언 및 초기화, 생성
        Hand hand = new Hand();
        TV tv = new SamsungTV();
        RemoteControl rc = new RemoteControl();
        //Hand와 tv 를 연결, RemoteControl과 TV 연결
        hand.tv = tv;
        rc.tv = tv;

        //손으로 TV를 키는 행동
        hand.handUseButton();
        //리모컨으로 채널 5 입력하는 행동
        rc.handUseChannelSet(5);
        //리모컨으로 채널 올리는 행동
        rc.setHandUseChannelUp();
        //리모컨으로 채널 내리는 행동
        rc.setHandUseChannelDown();
        rc.setHandUseChannelDown();
        rc.setHandUseChannelDown();
        rc.setHandUseChannelDown();
        rc.setHandUseChannelDown();
        //0은 없는 채널이므로 다시 1채널로 돌아온다.
        rc.setHandUseChannelDown();
        System.out.println();

        //리모컨 전원버튼을 눌러서 TV를 끄는 행동
        rc.handUseButton();
        System.out.println();

        //리모컨 전원버튼을 눌러서 TV를 키는 행동
        rc.handUseButton();
        System.out.println();

        //손으로 TV를 끄는 행동
        hand.handUseButton();
    }
}
