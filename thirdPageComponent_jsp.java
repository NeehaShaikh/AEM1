package org.apache.jsp.apps.Neeha.components.thirdPageComponent;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class thirdPageComponent_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <h1>Painting and sculpture</h1>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<p style=\"color:orange;\">Paris was in its artistic prime in the 19th century and early 20th century, when it had a colony of artists established in the city and in art schools associated with some of the finest painters of the times: Ãdouard Manet, Claude Monet, Berthe Morisot, Paul Gauguin, Pierre-Auguste Renoir and others. The French Revolution and political and social change in France had a profound influence on art in the capital. Paris was central to the development of Romanticism in art, with painters such as Gericault.[210] Impressionism, Art Nouveau, Symbolism, Fauvism, Cubism and Art Deco movements all evolved in Paris.[210] In the late 19th century, many artists in the French provinces and worldwide flocked to Paris to exhibit their works in the numerous salons and expositions and make a name for themselves.[211] Artists such as Pablo Picasso, Henri Matisse, Vincent van Gogh, Paul CÃ©zanne, Jean Metzinger, Albert Gleizes, Henri Rousseau, Marc Chagall, Amedeo Modigliani and many others became associated with Paris. Picasso, living in Montmartre, painted his famous La Famille de Saltimbanques and Les Demoiselles d'Avignon between 1905 and 1907.[212] Montmartre and Montparnasse became centres for artistic production.\n");
      out.write("\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("    <h2>Media</h2>\n");
      out.write("    <p style=\"color:pink;\">Paris and its close suburbs is home to numerous newspapers, magazines and publications including Le Monde, Le Figaro, LibÃ©ration, Le Nouvel Observateur, Le Canard enchaÃ®nÃ©, La Croix, Pariscope, Le Parisien (in Saint-Ouen), Les Ãchos, Paris Match (Neuilly-sur-Seine), RÃ©seaux & TÃ©lÃ©coms, Reuters France, and L'Officiel des Spectacles.[312] France's two most prestigious newspapers, Le Monde and Le Figaro, are the centrepieces of the Parisian publishing industry.[313] Agence France-Presse is France's oldest, and one of the world's oldest, continually operating news agencies. AFP, as it is colloquially abbreviated, maintains its headquarters in Paris, as it has since 1835.[314] France 24 is a television news channel owned and operated by the French government, and is based in Paris.[315] Another news agency is France Diplomatie, owned and operated by the Ministry of Foreign and European Affairs, and pertains solely to diplomatic news and occurrences.[316]\n");
      out.write("\n");
      out.write("        The most-viewed network in France, TF1, is in nearby Boulogne-Billancourt. France 2, France 3, Canal+, France 5, M6 (Neuilly-sur-Seine), Arte, D8, W9, NT1, NRJ 12, La ChaÃ®ne parlementaire, France 4, BFM TV, and Gulli are other stations located in and around the capital.[317] Radio France, France's public radio broadcaster, and its various channels, is headquartered in Paris's 16th arrondissement. Radio France Internationale, another public broadcaster is also based in the city.[318] Paris also holds the headquarters of the La Poste, France's national postal carrier.[319]</p>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
