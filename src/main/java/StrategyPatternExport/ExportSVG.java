package StrategyPatternExport;

public class ExportSVG implements ExportDiagramme{
    @Override
    public void exportDiagramme() {
        System.out.println("SVG");
    }
}
