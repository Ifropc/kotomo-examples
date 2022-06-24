import io.github.ifropc.kotomo.jvm.KanjiTomo;
import io.github.ifropc.kotomo.ocr.ImageLoader;
import io.github.ifropc.kotomo.ocr.entities.KotomoImage;
import io.github.ifropc.kotomo.ocr.entities.Point;
import io.github.ifropc.kotomo.ocr.results.OCRResults;

import java.awt.image.BufferedImage;

import static io.github.ifropc.kotomo.jvm.util.JVMUtilKt.toKotomoImage;

public class Main {
    public static void main(String[] args) {
        KanjiTomo tomo = new KanjiTomo();
        tomo.loadData();
        KotomoImage img = ImageLoader.INSTANCE.loadFromFileSync("1.jpg");
        tomo.setTargetImage(img);
        OCRResults results = tomo.runOCRSync(new Point(0, 0));
        // Example of transforming BufferedImage to KotomoImage
        KotomoImage i = toKotomoImage(new BufferedImage(0, 0, 0));
        System.out.println(results);
    }
}
