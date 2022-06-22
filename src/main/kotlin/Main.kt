import io.github.ifropc.kotomo.jvm.KanjiTomo
import io.github.ifropc.kotomo.ocr.ImageLoader
import io.github.ifropc.kotomo.ocr.entities.Point


fun main(args: Array<String>) {
    val tomo = KanjiTomo()
    tomo.loadData()
    val image = ImageLoader.loadFromFileSync("1.jpg")
    tomo.setTargetImage(image)
    val results = tomo.runOCRSync(Point(0, 0))
    print(results)
}
