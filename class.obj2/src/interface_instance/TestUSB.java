package interface_instance;

public class TestUSB {
    public static void main(String[] args) {
        computer computer1=new computer();
        computer1.powerOn();

        // 使用鼠标设备
        computer1.useDevice(new Mouse());
        //使用键盘设备 computer.useDevice(new KeyBoard());
        computer1.useDevice(new KeyBoard());
        computer1.powerOff();
    }
}
