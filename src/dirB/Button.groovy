package dirB

class Button {

    void addOnClickListener(OnClickListener listener) {
        listener.onClick()
    }

    void addOnLongClickListener(OnLongClickListener listener) {
        listener.onLongClick()
    }

    void addOnStateChangeListener(OnStateChangeListener listener) {
        listener.onCreate()
        listener.onStart()
        listener.onStop()
        listener.onDestory()
    }
}
