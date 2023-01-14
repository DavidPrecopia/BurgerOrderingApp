package welcome;

public interface IWelcomeViewContract {

    interface logic{void onEvent(WelcomeViewEvents event);}
    interface View{
        void onLogicEvent(WelcomeLogicEvents event);
    }

}