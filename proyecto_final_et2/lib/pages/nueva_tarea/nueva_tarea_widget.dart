import '/flutter_flow/flutter_flow_theme.dart';
import '/flutter_flow/flutter_flow_util.dart';
import '/flutter_flow/flutter_flow_widgets.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';

import 'nueva_tarea_model.dart';
export 'nueva_tarea_model.dart';

class NuevaTareaWidget extends StatefulWidget {
  const NuevaTareaWidget({Key? key}) : super(key: key);

  @override
  _NuevaTareaWidgetState createState() => _NuevaTareaWidgetState();
}

class _NuevaTareaWidgetState extends State<NuevaTareaWidget> {
  late NuevaTareaModel _model;

  final scaffoldKey = GlobalKey<ScaffoldState>();

  @override
  void initState() {
    super.initState();
    _model = createModel(context, () => NuevaTareaModel());
  }

  @override
  void dispose() {
    _model.dispose();

    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    if (isiOS) {
      SystemChrome.setSystemUIOverlayStyle(
        SystemUiOverlayStyle(
          statusBarBrightness: Theme.of(context).brightness,
          systemStatusBarContrastEnforced: true,
        ),
      );
    }

    return GestureDetector(
      onTap: () => _model.unfocusNode.canRequestFocus
          ? FocusScope.of(context).requestFocus(_model.unfocusNode)
          : FocusScope.of(context).unfocus(),
      child: Scaffold(
        key: scaffoldKey,
        backgroundColor: FlutterFlowTheme.of(context).primaryBackground,
        appBar: AppBar(
          backgroundColor: FlutterFlowTheme.of(context).primary,
          automaticallyImplyLeading: true,
          actions: [],
          centerTitle: false,
          elevation: 2,
        ),
        body: SafeArea(
          top: true,
          child: Column(
            mainAxisSize: MainAxisSize.max,
            children: [
              Expanded(
                child: Row(
                  mainAxisSize: MainAxisSize.max,
                  children: [
                    Flexible(
                      child: Column(
                        mainAxisSize: MainAxisSize.max,
                        children: [
                          Align(
                            alignment: AlignmentDirectional(0.00, -1.00),
                            child: Padding(
                              padding:
                              EdgeInsetsDirectional.fromSTEB(0, 0, 0, 20),
                              child: Row(
                                mainAxisSize: MainAxisSize.max,
                                children: [
                                  Text(
                                    'Nueva tarea 1',
                                    style:
                                    FlutterFlowTheme.of(context).titleLarge,
                                  ),
                                ].addToStart(SizedBox(width: 50)),
                              ),
                            ),
                          ),
                          Row(
                            mainAxisSize: MainAxisSize.max,
                            children: [
                              FaIcon(
                                FontAwesomeIcons.alignLeft,
                                color:
                                FlutterFlowTheme.of(context).secondaryText,
                                size: 24,
                              ),
                              Text(
                                'Descripcion nueva tarea 1',
                                style: FlutterFlowTheme.of(context).bodyLarge,
                              ),
                            ]
                                .divide(SizedBox(width: 20))
                                .addToStart(SizedBox(width: 50)),
                          ),
                          Row(
                            mainAxisSize: MainAxisSize.max,
                            children: [
                              Icon(
                                Icons.calendar_today,
                                color:
                                FlutterFlowTheme.of(context).secondaryText,
                                size: 24,
                              ),
                              Text(
                                '30 sep. 2023, 19:00',
                                style: FlutterFlowTheme.of(context).bodyMedium,
                              ),
                            ]
                                .divide(SizedBox(width: 20))
                                .addToStart(SizedBox(width: 50)),
                          ),
                          Row(
                            mainAxisSize: MainAxisSize.max,
                            children: [
                              Icon(
                                Icons.access_time,
                                color:
                                FlutterFlowTheme.of(context).secondaryText,
                                size: 24,
                              ),
                              Text(
                                'Cada 1 semana',
                                style: FlutterFlowTheme.of(context).bodyLarge,
                              ),
                            ]
                                .divide(SizedBox(width: 20))
                                .addToStart(SizedBox(width: 50)),
                          ),
                        ]
                            .divide(SizedBox(height: 20))
                            .addToStart(SizedBox(height: 20)),
                      ),
                    ),
                  ],
                ),
              ),
              Align(
                alignment: AlignmentDirectional(0.00, 0.00),
                child: Row(
                  mainAxisSize: MainAxisSize.max,
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    Container(
                      width: 397,
                      height: 70,
                      decoration: BoxDecoration(
                        color: FlutterFlowTheme.of(context).alternate,
                      ),
                      child: Align(
                        alignment: AlignmentDirectional(0.00, 0.00),
                        child: Row(
                          mainAxisSize: MainAxisSize.max,
                          mainAxisAlignment: MainAxisAlignment.end,
                          children: [
                            FFButtonWidget(
                              onPressed: () async {
                                context.pop();
                              },
                              text: 'Guardar',
                              options: FFButtonOptions(
                                height: 40,
                                padding: EdgeInsetsDirectional.fromSTEB(
                                    24, 0, 24, 0),
                                iconPadding:
                                EdgeInsetsDirectional.fromSTEB(0, 0, 0, 0),
                                color: FlutterFlowTheme.of(context).primary,
                                textStyle: FlutterFlowTheme.of(context)
                                    .titleSmall
                                    .override(
                                  fontFamily: 'Poppins',
                                  color: Colors.white,
                                ),
                                elevation: 3,
                                borderSide: BorderSide(
                                  color: Colors.transparent,
                                  width: 1,
                                ),
                                borderRadius: BorderRadius.circular(8),
                              ),
                            ),
                          ]
                              .addToStart(SizedBox(width: 5))
                              .addToEnd(SizedBox(width: 15)),
                        ),
                      ),
                    ),
                  ],
                ),
              ),
            ].divide(SizedBox(height: 10)),
          ),
        ),
      ),
    );
  }
}
