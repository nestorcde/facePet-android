package py.com.prestosoftware.facepet.ui.Events.dummy;

import java.util.List;

import py.com.prestosoftware.facepet.data.model.Eventos;
import py.com.prestosoftware.facepet.ui.base.Presenter;
import py.com.prestosoftware.facepet.ui.base.View;

public interface EventsContract {
    interface EventsPresenter extends Presenter<EventsView>{
        void getEvents();
        void setFav(int idUsuario, int idEvento);
    }

    interface EventsView extends View{
        void loadEvents(List<Eventos> eventos);
        void confirmFav(Boolean bool);
    }
}
