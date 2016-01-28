/**
 * @author alexanderweiss
 * @date 12.12.2015
 */
package model.campaign;

public class CampaignContent {

	
	private String plain_text;
	private String html;
	
	public CampaignContent(String plain_text, String html) {
		setPlain_text(plain_text);
		setHtml(html);
	}

	/**
	 * @return the plain_text
	 */
	public String getPlain_text() {
		return plain_text;
	}

	/**
	 * @param plain_text the plain_text to set
	 */
	public void setPlain_text(String plain_text) {
		this.plain_text = plain_text;
	}

	/**
	 * @return the html
	 */
	public String getHtml() {
		return html;
	}

	/**
	 * @param html the html to set
	 */
	public void setHtml(String html) {
		this.html = html;
	}

}
