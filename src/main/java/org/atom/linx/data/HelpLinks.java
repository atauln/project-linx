package org.atom.linx.data;

public class HelpLinks {
    public String help_link_name;
    public String help_link_icon;
    public HelpLink[] custom_help_links;
    public HelpLink[] default_help_links;

    public String getHelpLinkName() {
        return help_link_name;
    }

    public void setHelpLinkName(String help_link_name) {
        this.help_link_name = help_link_name;
    }

    public String getHelpLinkIcon() {
        return help_link_icon;
    }

    public void setHelpLinkIcon(String help_link_icon) {
        this.help_link_icon = help_link_icon;
    }

    public HelpLink[] getCustomHelpLinks() {
        return custom_help_links;
    }

    public void setCustomHelpLinks(HelpLink[] custom_help_links) {
        this.custom_help_links = custom_help_links;
    }

    public HelpLink[] getDefaultHelpLinks() {
        return default_help_links;
    }

    public void setDefaultHelpLinks(HelpLink[] default_help_links) {
        this.default_help_links = default_help_links;
    }
}
