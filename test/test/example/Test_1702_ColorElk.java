package test.example;

import java.io.*;
import java.net.*;

import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;

import static test.utils.PlantUmlTestUtils.exportDiagram;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

// fixes elk layout: arrow lines uses correct color, style and thickness based on stereotypes
// not fixed: color of arrow labels is not fixed/changed
class Test1702ColorElk {

	@Test
	public void test_help_themes() throws Exception {
		exportDiagram(
				"@startuml",
				"!theme C4_united from <C4/themes>",
				"!include <C4/C4_Component>",
				"!pragma layout elk",
				"'!pragma layout smetana",
				"'known issue: $textColor is not working with elk/smetana",
				"' AddRelTag(\"DEF\", $legendText=\"Java-Abhängigkeit\", $textColor = \"#green\", $lineColor = \"#blue\", $lineStyle = DottedLine(), $lineThickness=7)",
				"AddRelTag(\"DEF\", $textColor = \"#green\", $lineColor = \"#blue\", $lineStyle = DottedLine(), $lineThickness=7)",
				"Component(A, \"A\")",
				"Component(B, \"B\")",
				"A -[#orange,dashed]-> B",
				"' WithoutPropertyHeader()",
				"AddProperty(\"PropC1\", \"ValueC1\")",
				"AddProperty(\"PropC2\", \"ValueC2\")",
				"Rel(A, B, \"Te<$person>st\", $tags=\"DEF\")",

				"SHOW_LEGEND()",
				"@enduml"
		    ).toFile(java.nio.file.Paths.get("./Test_1702_ElkArrowColor.svg"), FileFormat.SVG);
	}
}

