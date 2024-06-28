package test.example;

import net.sourceforge.plantuml.FileFormat;

import static test.utils.PlantUmlTestUtils.exportDiagram;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

// combines all words in the same line to one "text line" entry": https://forum.plantuml.net/18858/exports-diagrams-maxmessagesize-wrapwidth-spacing-issues
class Test_TextFractionalMetric {

	@Test
	public void test_rendering_simple() throws Exception {
		exportDiagram(
				"@startuml",
				"skinparam arrow {",
				"FontSize 8",
				"}",
				"skinparam maxMessageSize 250",
				"a -> a : **Perform the usual session auth**",
				"@enduml"
		    ).toFile(java.nio.file.Paths.get("./Test_FractionalMetric_Simple.svg"), FileFormat.SVG);
	}

	@Test
	public void test_rendering_C4Sequence() throws Exception {
		exportDiagram(
						"@startuml",
						"!include https://raw.githubusercontent.com/plantuml-stdlib/C4-PlantUML/master/C4_Sequence.puml",
						"",
						"Container(c1, \"Single-Page Application\", \"JavaScript and Angular\", \"Provides all of the Internet banking functionality to customers via their web browser.\")",
						"",
						"Container_Boundary(b, \"API Application\")",
						"  Component(c2, \"Sign In Controller\", \"Spring MVC Rest Controller\", \"Allows users to sign in to the Internet Banking System.\")",
						"  Component(c3, \"Security Component\", \"Spring Bean\", \"Provides functionality Related to signing in, changing passwords, etc.\")",
						"Boundary_End()",
						"",
						"ContainerDb(c4, \"Database\", \"Relational Database Schema\", \"Stores user registration information, hashed authentication credentials, access logs, etc.\")",
						"",
						"Rel(c1, c2, \"Submits credentials to\", \"JSON/HTTPS\")",
						"Rel(c2, c3, \"Calls isAuthenticated() on\")",
						"Rel(c3, c4, \"select * from users where username = ?\", \"JDBC\")",
						"",
						"SHOW_LEGEND()",
						"",
						"@enduml"
		).toFile(java.nio.file.Paths.get("./Test_FractionalMetric_C4_Sequence.svg"), FileFormat.SVG);
	}

}

