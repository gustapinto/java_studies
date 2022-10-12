package java_explorer.duke.choice;

import java.util.Arrays;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

public class ItemList implements Handler {
    private Clothing[] items;

    public ItemList(Clothing[] items) {
        this.items = items;
    }

    @Override
    public void accept(ServerRequest req, ServerResponse res) {
        res.status(Http.Status.OK_200);
        res.headers().put("Content-Type", "text/plain; charset=UTF-8");

        res.send(Arrays.toString(this.items));
    }
}
