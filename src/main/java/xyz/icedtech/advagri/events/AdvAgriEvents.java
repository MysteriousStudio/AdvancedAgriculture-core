package xyz.icedtech.advagri.events;

public class AdvAgriEvents {

    private static AdvAgriEvents advAgriEvents = new AdvAgriEvents();

    private AdvAgriEvents() {

    }

    public static AdvAgriEvents getInstance() {
        return advAgriEvents;
    }

    public void InitAllEvents() {
        GrassBrokenEvent.getInstance().Init();
    }
}
