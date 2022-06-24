import io.github.ifropc.kotomo.jvm.KanjiTomo
import io.github.ifropc.kotomo.jvm.util.toKotomoImage
import io.github.ifropc.kotomo.ocr.ImageLoader
import io.github.ifropc.kotomo.ocr.entities.Point
import java.awt.image.BufferedImage


fun main(args: Array<String>) {
    val tomo = KanjiTomo()
    tomo.loadData()
    val image = ImageLoader.loadFromFileSync("1.jpg")
    tomo.setTargetImage(image)
    val results = tomo.runOCRSync(Point(0, 0))
    // Example of transforming BufferedImage to KotomoImage
    val i = BufferedImage(0, 0, 0).toKotomoImage()
    print(results)
}
