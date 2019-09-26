package nl.craftsdemo.java13demo;

import org.junit.Test;

public class TextBlocksDemo {

    String html = """
                  <html>
                      <body>
                          <p>Hello, Craftsmen</p>
                      </body>
                  </html>
                  """;

    @Test
    public void textBlocks() {
        System.out.println(html);
    }

    @Test
    public void stripIndent() {
        System.out.println(" a\n b\n c\n".stripIndent());
    }

    @Test
    public void formatted() {
        System.out.println("Hi %s".formatted("John"));
    }

    @Test
    public void translateEscapes() {
        System.out.println("\\tThat's a tab".translateEscapes());
    }

}
