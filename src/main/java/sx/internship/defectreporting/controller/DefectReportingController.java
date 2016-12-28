package sx.internship.defectreporting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefectReportingController {
	@RequestMapping("/table-view")
	public String ShowTableView() {
		return "table-view";
	}

	@RequestMapping("/pie-chart-view")
	public String ShowPieChat() {
		return "pie-chart-view";
	}

	@RequestMapping("/scatter-plot")
	public String ShowScatterPlot() {
		return "scatter-plot";
	}
}
