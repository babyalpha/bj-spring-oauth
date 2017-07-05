import org.springframework.http.MediaType;

import java.nio.charset.Charset;

/**
 * Created by 2014233 on 2017-07-05.
 */
public class TestUtil {
    public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8")
    );
}
