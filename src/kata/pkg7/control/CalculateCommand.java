package kata.pkg7.control;

import kata.pkg7.model.Histogram;
import kata.pkg7.view.AttributeDialog;
import kata.pkg7.view.HistogramBuilder;
import kata.pkg7.view.HistogramDisplay;
import kata.pkg7.view.PopulationDialog;

public class CalculateCommand implements Command {
    private final AttributeDialog attributeDialog;
    private final PopulationDialog populationDialog;
    private final HistogramDisplay display;

    public CalculateCommand(AttributeDialog attributeDialog, PopulationDialog populationDialog, HistogramDisplay display) {
        this.attributeDialog = attributeDialog;
        this.populationDialog = populationDialog;
        this.display = display;
    }
    
    @Override
    public void execute() {
        Histogram histogram = new HistogramBuilder(populationDialog.population()).build(attributeDialog.attribute());
        display.show(histogram);
    }

}
