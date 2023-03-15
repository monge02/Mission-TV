package TvOn;

public class Main {
       public static void main(String[] args) {

        Hand hand = new Hand();
        TV tv = new XiaomiTV();
        RemoteControl rc = new RemoteControl();
        hand.tv = tv;
        rc.tv = tv;

        hand.handUseButton();
        rc.handUseChannelSet(5);
        rc.setHandUseChannelUp();
        rc.setHandUseChannelDown();
        rc.setHandUseChannelDown();
        rc.setHandUseChannelDown();
        rc.setHandUseChannelDown();
        rc.setHandUseChannelDown();
        rc.setHandUseChannelDown();
        System.out.println();

        rc.handUseButton();
        System.out.println();

        rc.handUseButton();
        System.out.println();

        hand.handUseButton();
    }
}
