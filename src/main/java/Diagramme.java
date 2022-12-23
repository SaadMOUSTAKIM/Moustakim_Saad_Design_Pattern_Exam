import Entities.Entite;
import Methodes.Methodes;
import Relations.Relation;
import StrategyPatternCode.CodeGenerateur;
import StrategyPatternCode.JavaGenerateur;
import StrategyPatternExport.*;

import java.util.ArrayList;
import java.util.List;

public class Diagramme {

List<Entite> entiteList =new ArrayList<>();
List<Relation> relationList=new ArrayList<>();
CodeGenerateur codeGenerateur=new JavaGenerateur();
ExportDiagramme exportDiagramme=new ExportBinaire();
ExportDiagramme exportDiagramme1=new ExportJson();
ExportDiagramme exportDiagramme2=new ExportSVG();
ExportDiagramme exportDiagramme3=new ExportXML();
}
