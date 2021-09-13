package org.atom.linx.data;

public class HelpLinks {
    public String help_link_name;
    public String help_link_icon;
    public HelpLink[] custom_help_links;
    public HelpLink[] default_help_links;

    public String getHelp_link_name() {
        return help_link_name;
    }

    public void setHelp_link_name(String help_link_name) {
        this.help_link_name = help_link_name;
    }

    public String getHelp_link_icon() {
        return help_link_icon;
    }

    public void setHelp_link_icon(String help_link_icon) {
        this.help_link_icon = help_link_icon;
    }

    public HelpLink[] getCustom_help_links() {
        return custom_help_links;
    }

    public void setCustom_help_links(HelpLink[] custom_help_links) {
        this.custom_help_links = custom_help_links;
    }

    public HelpLink[] getDefault_help_links() {
        return default_help_links;
    }

    public void setDefault_help_links(HelpLink[] default_help_links) {
        this.default_help_links = default_help_links;
    }
}
