package interface_instance;

public class computer {
    public void powerOn(){
        System.out.println("打开电脑");
    }
    public void powerOff()
    {
        System.out.println("关闭笔记本电脑");
    }
    public void useDevice(USB usb){
        usb.openDevice();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }
        else if(usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard)usb;
            keyBoard.inPut();
        }
        usb.closeDevice(); }
}




